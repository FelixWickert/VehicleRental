package client;

import java.util.*;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.view.client.ListDataProvider;





public class TableForProfiles   {
    
    public TableForProfiles(){}

    public static CellTable onLoad() {

      // Create a CellTable.
      CellTable<Contact> table = new CellTable<Contact>();

      // Create name column.
      TextColumn<Contact> nameColumn = new TextColumn<Contact>() {
        @Override
        public String getValue(Contact contact) {
          return contact.name;
        }
      };

      // Create address column.
      TextColumn<Contact> addressColumn = new TextColumn<Contact>() {
        @Override
        public String getValue(Contact contact) {
          return contact.address;
        }
      };

      // Add the columns.
      table.addColumn(nameColumn, "Name");
      table.addColumn(addressColumn, "Address");

      // Set the total row count. This isn't strictly necessary, but it affects
      // paging calculations, so its good habit to keep the row count up to date.
      table.setRowCount(CONTACTS.size(), true);

      // Push the data into the widget.
      table.setRowData(0, CONTACTS);

      // Add it to the root panel.
    return table;
    }
    private static class Contact {
	    private final String name;
	    private final String address;

	    public Contact(String name, String address) {
	      this.name = name;
	      this.address = address;
	    }
	  }

	  // The list of data to display.
	  private static List<Contact> CONTACTS = Arrays.asList(
	    new Contact("Audi", "SUV"),
	    new Contact("VW", "Kombi"));


  }