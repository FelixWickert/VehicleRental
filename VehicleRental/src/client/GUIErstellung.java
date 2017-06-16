package client;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.cell.client.TextInputCell;
import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

import client.Header;
import client.Navigation;
import client.ReservationGUI;
import client.CompositeExample.OptionalTextBox;
import shared.VehicleRentalAdministration;
import shared.VehicleRentalAdministrationAsync;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GUIErstellung implements EntryPoint {

    
    private static final List<String> DAYS = Arrays.asList("Sunday", "Monday",
        "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

    public void onModuleLoad() {
      // Create a cell that will interact with a value updater.
      TextInputCell inputCell = new TextInputCell();

      // Create a CellList that uses the cell.
      CellList<String> cellList = new CellList<String>(inputCell);

      // Create a value updater that will be called when the value in a cell changes.
      ValueUpdater<String> valueUpdater = new ValueUpdater<String>() {
        public void update(String newValue) {
          Window.alert("You typed: " + newValue);
        }
      };

      // Add the value updater to the cellList.
      cellList.setValueUpdater(valueUpdater);

      // Set the total row count. This isn't strictly necessary, but it affects
      // paging calculations, so its good habit to keep the row count up to date.
      cellList.setRowCount(DAYS.size(), true);

      // Push the data into the widget.
      cellList.setRowData(0, DAYS);

      // Add it to the root panel.
      RootPanel.get().add(cellList);
    }
  }