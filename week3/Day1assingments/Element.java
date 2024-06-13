package week3.Day1assingments;

public class Element extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Element E = new Element();
		E.submit();
		E.click();
		E.setText("Hello");
		
		System.out.println("         ");
		
		
		TextFields textField = new TextFields();
        textField.click();
        textField.setText("Username");
        textField.getText();
        
        
        System.out.println("         ");


        CheckBoxButton checkBoxButton = new CheckBoxButton();
        checkBoxButton.click();
        checkBoxButton.setText("I agree");
        checkBoxButton.submit();
        checkBoxButton.clickCheckButton();
        System.out.println("         ");

        RadioButton radioButton = new RadioButton();
        radioButton.click();
        radioButton.setText("Option 1");
        radioButton.submit();
        radioButton.selectRadioButton();
        System.out.println("         ");

	}

}
