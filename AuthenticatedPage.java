class AuthenticatedPage extends WebPageDecorator {
    public AuthenticatedPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void showWebPage() {
        checkAuthorization();
        super.showWebPage();
    }

    private void checkAuthorization() {
        System.out.println("Verifying User");
        System.out.println("Token Received, Success !");
    }
}
