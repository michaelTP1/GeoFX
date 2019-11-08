package dad.javafx.geofx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GeoFXModel {

	public StringProperty latitude=new SimpleStringProperty();
	public StringProperty longitude=new SimpleStringProperty();
	public StringProperty cityAndState=new SimpleStringProperty();
	public StringProperty zipCode=new SimpleStringProperty();
	public StringProperty language=new SimpleStringProperty();
	public StringProperty timeZone=new SimpleStringProperty();
	public StringProperty callingCode=new SimpleStringProperty();
	public StringProperty currency=new SimpleStringProperty();
	
	
	public final StringProperty latitudeProperty() {
		return this.latitude;
	}
	
	public final String getLatitude() {
		return this.latitudeProperty().get();
	}
	
	public final void setLatitude(final String latitude) {
		this.latitudeProperty().set(latitude);
	}
	
	public final StringProperty longitudeProperty() {
		return this.longitude;
	}
	
	public final String getLongitude() {
		return this.longitudeProperty().get();
	}
	
	public final void setLongitude(final String longitude) {
		this.longitudeProperty().set(longitude);
	}
	
	public final StringProperty cityAndStateProperty() {
		return this.cityAndState;
	}
	
	public final String getCityAndState() {
		return this.cityAndStateProperty().get();
	}
	
	public final void setCityAndState(final String cityAndState) {
		this.cityAndStateProperty().set(cityAndState);
	}
	
	public final StringProperty zipCodeProperty() {
		return this.zipCode;
	}
	
	public final String getZipCode() {
		return this.zipCodeProperty().get();
	}
	
	public final void setZipCode(final String zipCode) {
		this.zipCodeProperty().set(zipCode);
	}
	
	public final StringProperty languageProperty() {
		return this.language;
	}
	
	public final String getLanguage() {
		return this.languageProperty().get();
	}
	
	public final void setLanguage(final String language) {
		this.languageProperty().set(language);
	}
	
	public final StringProperty timeZoneProperty() {
		return this.timeZone;
	}
	
	public final String getTimeZone() {
		return this.timeZoneProperty().get();
	}
	
	public final void setTimeZone(final String timeZone) {
		this.timeZoneProperty().set(timeZone);
	}
	
	public final StringProperty callingCodeProperty() {
		return this.callingCode;
	}
	
	public final String getCallingCode() {
		return this.callingCodeProperty().get();
	}
	
	public final void setCallingCode(final String callingCode) {
		this.callingCodeProperty().set(callingCode);
	}
	
	public final StringProperty currencyProperty() {
		return this.currency;
	}
	
	public final String getCurrency() {
		return this.currencyProperty().get();
	}
	
	public final void setCurrency(final String currency) {
		this.currencyProperty().set(currency);
	}
	
	
}
