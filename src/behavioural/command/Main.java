package behavioural.command;

import behavioural.command.framework.Button;

public class Main {

    public static void main(String[] args){
        CustomerService service = new CustomerService();
        AddCustomerCommand command = new AddCustomerCommand(service);
        Button button = new Button(command); // Passing which behavioural.command it should execute on click().

        button.click();
    }
}
