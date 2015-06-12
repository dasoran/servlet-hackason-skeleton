package org.docksidestage;

import org.dbflute.tomcat.TomcatBoot;

public class Boot {
	public static void main(String[] args) {
	    new TomcatBoot(8092, "/").asDevelopment().bootAwait();
	}
}
