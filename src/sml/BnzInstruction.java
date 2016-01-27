package sml;

public class BnzInstruction extends Instruction{
    private int register;
    private int value;
    private String jumpTo;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String label2) {
        super(label, "bnz");
        this.register = register;
        this.jumpTo = label2;
    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register)>0){
            int jumpToIndex = m.getLabels().indexOf(jumpTo);
            m.setPc(jumpToIndex);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " jump to " + jumpTo + " if register " + register + " value is " + value;
    }
}
