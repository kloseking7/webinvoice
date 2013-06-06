package com.glassbox.webinvoice.client.ui.container.pages;

import com.glassbox.webinvoice.client.service.LoginServiceClientImpl;
import com.glassbox.webinvoice.shared.model.AuthenticationResult;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginBox extends DialogBox {
	private static LoginBoxUiBinder uiBinder = GWT
			.create(LoginBoxUiBinder.class);
	private LoginServiceClientImpl loginservice;
	interface LoginBoxUiBinder extends UiBinder<Widget, LoginBox> {
	}

	@UiField
	Button LoginButton;
	@UiField
	Button CancelButton;
	@UiField
	TextBox login;
	@UiField
	TextBox password;
	@UiField
	Label message;
	

	public LoginBox() {
		this.loginservice = new LoginServiceClientImpl(GWT.getModuleBaseURL()
				+ "services/login", this);
		this.setSize("500px", "300px");
		this.add(uiBinder.createAndBindUi(this));
		this.setModal(true);
		this.setGlassEnabled(true);
		this.center();
		login.getElement().setId("login");
		password.getElement().setId("password");
		LoginButton.getElement().setId("loginbutton");
		// LoginButton.addClickHandler(new LoginClickHandler());
		CancelButton.getElement().setId("cancelbutton");
		CancelButton.addClickHandler(new CancelClickHandler(this));
		message.getElement().setId("message");
	}

	public void UpdateLoginDialog(AuthenticationResult result) {
		if (!result.isAuthenticated()) {
			message.setText(result.getMessage());
			DOM.getElementById(result.getTagname()).focus();
		}
	}

	// /handle cancel click
	private class CancelClickHandler implements ClickHandler {
		private LoginBox LoginBoxReference;

		public CancelClickHandler(LoginBox LoginReference) {
			this.LoginBoxReference = LoginReference;
		}

		public void onClick(ClickEvent event) {
			this.LoginBoxReference.hide();
		}
	}

	// /handle login click
	@UiHandler("LoginButton")
	void handleClick(ClickEvent e) {
		loginservice.authenticateUser(login.getText(), password.getText());
	}

}
