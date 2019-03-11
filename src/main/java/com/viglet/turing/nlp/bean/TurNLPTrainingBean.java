package com.viglet.turing.nlp.bean;

public class TurNLPTrainingBean {

	private String term;
	private boolean ignore;
	private String ner;
	private String convertTo;
	
	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public boolean isIgnore() {
		return ignore;
	}

	public void setIgnore(boolean ignore) {
		this.ignore = ignore;
	}

	public String getNer() {
		return ner;
	}

	public void setNer(String ner) {
		this.ner = ner;
	}

	
	public String getConvertTo() {
		return convertTo;
	}

	public void setConvertTo(String convertTo) {
		this.convertTo = convertTo;
	}

	public String toString() {
		return String.format("%s %b %s",this.getTerm(),this.isIgnore(), this.getNer());
	}
}
