package org.autosparql.client.view;

import java.util.List;

import org.autosparql.client.AppEvents;
import org.autosparql.client.widget.SearchResultPanel;

import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.View;
import com.extjs.gxt.ui.client.widget.Label;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.user.client.ui.RootPanel;

public class ApplicationView extends View {


	private Viewport viewport;
//	private InputPanel north;
	private SearchResultPanel center;

	public ApplicationView(Controller controller) {
		super(controller);
	}

	protected void initialize() {
		super.initialize();
	}

	public void display(List<String> examples)
	{
		
	}
	
	private void initUI()
	{
		viewport = new Viewport();
		viewport.setLayout(new BorderLayout());

        String query = com.google.gwt.user.client.Window.Location.getParameter("query");
//        if(query==null||query.isEmpty())
//        {
//        	viewport.add(new Label("no query asked"));
//        }
//        else
//        {
//        	
//    		createCenter();        	
//        }
        createCenter();
//		createNorth();

		RootPanel.get("gwt-table").add(viewport);
	}

//	private void createNorth() {
//		north = new InputPanel();
//		viewport.add(north, new BorderLayoutData(LayoutRegion.NORTH));
//	}

	private void createCenter() {
		center = new SearchResultPanel();
		viewport.add(center, new BorderLayoutData(LayoutRegion.CENTER));
	}

	protected void handleEvent(AppEvent event) {
		if (event.getType() == AppEvents.Init) {
			initUI();
		}
	}

}