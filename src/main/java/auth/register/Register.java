package auth.register;

public interface Register {
    public void RegisterCaseTrue();

    public void RegisterCaseFalseByWrongUsername();
    public void RegisterCaseFalseByBlankPassWord();
    public void RegisterCaseFalseByWrongPassWord();

    public void RegisterCaseByFacebook();
    public void RegisterCaseByGoogle();
    public void RegisterCaseByApple();
    public void RegisterCaseByMetaMark();
}
