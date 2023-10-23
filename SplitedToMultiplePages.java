class SplitedToMultiplePages extends WebPageDecorator {
    public SplitedToMultiplePages(WebPage decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void showWebPage() {
        super.showWebPage();
        splitSearchResults();
    }

    private void splitSearchResults() {
        System.out.println("Spllited and showed search results into multiple pages.");
    }
}
