package command;

import command.framework.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }
    // Delegating the actual work to the service
    @Override
    public void execute() {
        service.addCustomer(); // Going to execute this function inside the click() method inside button.
    }
}
