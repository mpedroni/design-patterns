package com.codewithmosh.mediator;

public class SignUpDialogBox {
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox termsCheckBox = new CheckBox();
    private Button signUpButton = new Button();

    SignUpDialogBox() {
        usernameTextBox.addHandler(this::onFieldUpdate);
        passwordTextBox.addHandler(this::onFieldUpdate);
        termsCheckBox.addHandler(this::onFieldUpdate);
    }

    private void onFieldUpdate() {
        signUpButton.setEnabled(shouldEnableSignUpButton());
    }

    private boolean shouldEnableSignUpButton() {
        var hasUsername = !usernameTextBox.isEmpty();
        var hasPassword = !passwordTextBox.isEmpty();
        var hasAcceptedTerms = termsCheckBox.isChecked();

        return hasUsername && hasPassword && hasAcceptedTerms;
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + signUpButton.isEnabled());

        // The user enters their username, the button is still disabled
        usernameTextBox.setContent("username");
        System.out.println("After setting the username: " + signUpButton.isEnabled());

        // The user enters their password, the button is still disabled
        passwordTextBox.setContent("password");
        System.out.println("After setting the password: " + signUpButton.isEnabled());

        // The agrees to the terms, the button becomes enabled
        termsCheckBox.setChecked(true);
        System.out.println("After agreeing to terms: " + signUpButton.isEnabled());

        // The user removes the password, the button becomes disabled
        passwordTextBox.setContent("");
        System.out.println("After removing the password: " + signUpButton.isEnabled());

        // The user enters the password again, the button becomes enabled
        passwordTextBox.setContent("password");
        System.out.println("After re-setting the password: " + signUpButton.isEnabled());
    }
}
