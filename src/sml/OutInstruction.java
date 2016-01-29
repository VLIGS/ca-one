package sml;

public class OutInstruction extends Instruction{
    private int register;
    /**
    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }
     **/

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        System.out.println("Content of register " + register + " is " + m.getRegisters().getRegister(register));
    }

    @Override
    public String toString() {
        return super.toString() + " print contens of register " + register + " to console";
    }
}

