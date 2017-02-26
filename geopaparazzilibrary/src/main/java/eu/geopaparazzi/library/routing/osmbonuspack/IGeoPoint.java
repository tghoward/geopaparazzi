package eu.geopaparazzi.library.routing.osmbonuspack;

/**
 * An interface that resembles the Google Maps API GeoPoint class.
 */
public interface IGeoPoint {
    @Deprecated
    int getLatitudeE6();
    @Deprecated
    int getLongitudeE6();
    double getLatitude();
    double getLongitude();
}