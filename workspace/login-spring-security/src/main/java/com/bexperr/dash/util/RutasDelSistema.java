package com.bexperr.dash.util;

public enum RutasDelSistema {

	//Home
	INDEX(1,"index"),
	STARTER(2,"starter"),
	CHARTJS(3,"pages/charts/chartjs"),
	FLOT(4,"pages/charts/flot"),
	INLINE(5,"pages/charts/inline"),
	BLANK(6,"pages/examples/blank"),
	ECOMMERCE(7,"pages/examples/e-commerce"),
	CONTACTS(8,"pages/examples/contacts"),
	ERROR404(9,"pages/examples/404"),
	ERROR505(10,"pages/examples/500"),
	FORGOTPASSWORD(11,"pages/examples/forgot-password"),
	INVOICE(12,"pages/examples/invoice"),
	INVOICEPRINT(13,"pages/examples/invoice-print"),
	LANGUAGEMENU(14,"pages/examples/language-menu"),
	LEGACYUSERMENU(15,"pages/examples/legacy-user-menu"),
	LOCKSCREEN(16,"pages/examples/lockscreen"),
	LOGIN(17,"pages/examples/login"),
	PACE(18,"pages/examples/pace"),
	PROFILE(19,"pages/examples/profile"),
	PROJECTADD(20,"pages/examples/project-add"),
	PROJECTDETAIL(21,"pages/examples/project-detail"),
	PROJECTEDIT(22,"pages/examples/project-edit"),
	PROJECTS(23,"pages/examples/projects"),
	RECOVERPASSWORD(24,"pages/examples/recover-password"),
	REGISTER(25,"pages/examples/register"),
	ADVANCED(26,"pages/forms/advanced"),
	EDITORS(27, "pages/forms/editors"),
	GENERAL(28, "pages/forms/general"),
	VALIDATION(29, "pages/forms/validation"),
	BOXED(30,"pages/layout/boxed"),
	COLLAPSEDSIDEBAR(31,"pages/layout/collapsed-sidebar"),
	FIXEDFOOTER(32,"pages/layout/fixed-footer"),
	FIXEDSIDEBAR(33,"pages/layout/fixed-sidebar"),
	FIXEDTOPNAV(34,"pages/layout/fixed-topnav"),
	TOPNAV(35,"pages/layout/top-nav"),
	TOPNAVSIDEBAR(36,"pages/layout/top-nav-sidebar"),
	COMPOSE(37,"pages/mailbox/compose"),
	MAILBOX(38,"pages/mailbox/mailbox"),
	READMAIL(39,"pages/mailbox/read-mail"),
	CALENDAR(40,"pages/calendar"),
	GALLERY(41,"pages/gallery"),
	WIDGETS(42,"pages/widgets"),
	DATA(43,"pages/tables/data"),
	JSGRID(44,"pages/tables/jsgrid"),
	SIMPLE(45,"pages/tables/simple"),
	BUTTONS(46,"pages/UI/buttons"),
	UIGENERAL(47,"pages/UI/general"),
	ICONS(48,"pages/UI/icons"),
	MODALS(49,"pages/UI/modals"),
	NAVBAR(50,"pages/UI/navbar"),
	RIBBONS(51,"pages/UI/ribbons"),
	SLIDERS(52,"pages/UI/sliders"),
	TIMELINE(53,"pages/UI/timeline"),
	LOGINSECURITY(54,"login")
	;
	
	private final int key;
	private final String path;
	
	RutasDelSistema(int key, String path){
		this.key = key;
		this.path = path;
	}

	public int getKey() {
		return key;
	}

	public String getPath() {
		return path;
	}
	
	
}
