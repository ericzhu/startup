// create a closure
(function($){
	
	// create a plugin to handle the menu display and click event
	$.fn.accordionMenu = function(opts) {
		
		var settings = $.extend({
			selectedClass : "navSelected",
			submenuTitleNodeName : "h3"
		}, opts || {});
		
		var submenuTitles = $(this).find("ul>" + settings.submenuTitleNodeName);
		var selectedSubmenuTitles = $(this).find("ul." + settings.selectedClass + ">" + settings.submenuTitleNodeName);
		
		submenuTitles.css("cursor", "pointer");
		submenuTitles.nextAll().css("display", "none");
		selectedSubmenuTitles.nextAll().css("display", "block");
		
		// handle the click event on submenu title
		submenuTitles.click(function(){
			var isSelected = $(this).parent().hasClass(settings.selectedClass);
			if(isSelected) {
				$(this).nextAll().slideUp();
				$(this).parent().removeClass(settings.selectedClass);
			} else {
				$(this).nextAll().slideDown();
				$(this).parent().addClass(settings.selectedClass);
			}
		});
	};
})(jQuery)