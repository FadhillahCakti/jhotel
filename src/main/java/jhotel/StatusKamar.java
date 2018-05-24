package jhotel;
/**
 * Class Enum StatusKamar
 *
 * @author Cakti Fadhillah
 * @version 1.10 - 24 Mei 2018
 */
public enum StatusKamar
{
   Booked("Booked"),Processed("Processed"),Vacant("Vacant");

//instance variable

    private final String status;

	/**
     * Konstruktor pertama dari Enum StatusKamar
     */

    StatusKamar(String status) {
        this.status=status;
    }

	/**
     * Method String toString
     * Untuk mengambil status dari kamar
     * @return status dari StatusKamar
     */
    public String toString() {
        return this.status;
    }

}