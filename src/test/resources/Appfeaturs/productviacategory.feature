Feature: Product via category after applying multiple filters

	Scenario: Access a Product via category after applying multiple filters

	Given go to  www.ebay.com website
	And Navigate to Search by category > Electronics > Cell Phones & accessories
	And After the page loads, click Cell Phones & Smartphones in the left hand sidenavigation section.
	Then Now, click – See All (appears under “Shop by brand” or “Shop by Network”), apply filter
	Then Verify that the filter tags are applied, quit the browser

