package Chapter5;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String stateCode) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        setState(stateCode);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String stateCode){
        if (isValidNortheastState(stateCode)) {
            this.state = stateCode;
        } else {
            System.out.printf("Error: '%s' is not a valid northeast state code.%n", stateCode);
            this.state = "Invalid";
        }

        this.state = state;
    }
    public String getState() {
        return state;
    }
private boolean isValidNortheastState(String code) {
    return code.equals("CT") || code.equals("MA") || code.equals("ME") ||
            code.equals("NH") || code.equals("NJ") || code.equals("NY") ||
            code.equals("PA") || code.equals("VT");
}
    public boolean isNoFaultState() {
        boolean noFaultState;

        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
}