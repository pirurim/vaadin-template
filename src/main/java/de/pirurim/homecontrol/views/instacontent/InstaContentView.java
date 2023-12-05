package de.pirurim.homecontrol.views.instacontent;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import de.pirurim.homecontrol.views.MainLayout;

@PageTitle("Insta Content")
@Route(value = "insta-content", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class InstaContentView extends Composite<VerticalLayout> {

    public InstaContentView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        TextArea textArea = new TextArea();
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        CheckboxGroup checkboxGroup2 = new CheckboxGroup();
        TextArea textArea2 = new TextArea();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        TextArea textArea3 = new TextArea();
        CheckboxGroup checkboxGroup3 = new CheckboxGroup();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        TextArea textArea4 = new TextArea();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutColumn2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("min-content");
        layoutColumn2.setHeight("min-content");
        textArea.setLabel("Title");
        textArea.setWidth("min-content");
        checkboxGroup.setLabel("Include words");
        checkboxGroup.setWidth("min-content");
        checkboxGroup.setItems("Order ID", "Product Name", "Customer", "Status");
        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        layoutColumn3.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("200px");
        layoutColumn3.setHeight("min-content");
        checkboxGroup2.setLabel("Hashtag Category");
        checkboxGroup2.setWidth("min-content");
        checkboxGroup2.setItems("Order ID", "Product Name", "Customer", "Status");
        checkboxGroup2.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        textArea2.setLabel("Separator");
        textArea2.setWidth("100%");
        layoutColumn4.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth("100%");
        layoutColumn4.setHeight("min-content");
        textArea3.setLabel("Description");
        textArea3.setWidth("100%");
        checkboxGroup3.setLabel("Persons");
        checkboxGroup3.setWidth("min-content");
        checkboxGroup3.setItems("Order ID", "Product Name", "Customer", "Status");
        checkboxGroup3.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Generate");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        textArea4.setLabel("Output");
        textArea4.setWidth("100%");
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(textArea);
        layoutColumn2.add(checkboxGroup);
        layoutRow.add(layoutColumn3);
        layoutColumn3.add(checkboxGroup2);
        layoutColumn3.add(textArea2);
        layoutRow.add(layoutColumn4);
        layoutColumn4.add(textArea3);
        layoutColumn4.add(checkboxGroup3);
        getContent().add(layoutRow2);
        layoutRow2.add(buttonPrimary);
        layoutRow2.add(textArea4);
    }
}
