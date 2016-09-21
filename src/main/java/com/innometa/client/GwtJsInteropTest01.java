package com.innometa.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

public class GwtJsInteropTest01 implements EntryPoint {

	@JsType(isNative = true, namespace = JsPackage.GLOBAL)
	static class HTMLDivElement {
	}
	
	static class ExtendedElement extends HTMLDivElement {
	}
	
	public void onModuleLoad() {
		ExtendedElement element = new ExtendedElement();
		GWT.log(element.toString());
	}
}
