package command;

import command.framework.Button;

public class Main {

    public static void main(String[] args){
        CustomerService service = new CustomerService();
        AddCustomerCommand command = new AddCustomerCommand(service);
        Button button = new Button(command); // Passing which command it should execute on click().

        button.click();
    }
}
