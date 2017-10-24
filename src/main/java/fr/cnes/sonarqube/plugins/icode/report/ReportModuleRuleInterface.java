package fr.cnes.sonarqube.plugins.icode.report;

/**
 * Expected services for a global rule
 * 
 * @author Cyrille FRANCOIS
 *
 */
public interface ReportModuleRuleInterface {
	
	public String getLoc();

	public String getComplexity();

	public String getValue();
	
	
}