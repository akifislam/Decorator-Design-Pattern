public class DecoratorPatternDemo {
    public static void main(String[] args) {

        // Basic Webpage
        WebPage basicWebPage = new SimpleWebPage();
        System.out.println("\nBasic Web Page-");
        basicWebPage.showWebPage();

        // Authorized Webpage
        WebPage authorisedWebPage = new AuthenticatedPage(basicWebPage);
        System.out.println("\nAuthorised Web Page-");
        authorisedWebPage.showWebPage();

        // Pagination View
        WebPage paginatedPage = new SplitedToMultiplePages(basicWebPage);
        System.out.println("\nPaginated Web Page-");
        paginatedPage.showWebPage();
    }
}
