import java.util.*;
import java.io.*;

/**
 * The {@code DVLA} class represents a serializable object that models a Driver and Vehicle Licensing Agency.
 * It maintains information about car registrations, keepers, and provides functionality for managing and
 * retrieving relevant data. Implements the {@code Serializable} interface to support object serialization.
 */
public class DVLA implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * A mapping of registration numbers to corresponding car information.
     */
    private Map<RegNo, Car> registrationInfoMap;

    /**
     * A mapping of registration numbers to corresponding keeper information.
     */
    private Map<RegNo, Keeper> keeperInfoMap;

    /**
     * A map representing car registrations.
     */
    private Map<RegNo, Car> carRegistrations = new HashMap<>();

    /**
     * A map representing keeper information.
     */
    private Map<RegNo, Keeper> keeperInfo = new HashMap<>();
    
    
    /**
     * Constructs a new {@code DVLA} object with empty registration and keeper information maps.
     */
    public DVLA() {
        this.setRegistrationInfoMap(new HashMap<>());
        this.keeperInfoMap = new HashMap<>();
    }

    /**
     * Adds car registration information to the DVLA database.
     *
     * @param regNo The registration number of the car.
     * @param car   The car information to be added.
     */
    public void addCarRegistration(RegNo regNo, Car car) {
        getRegistrationInfoMap().put(regNo, car);
    }

    /**
     * Adds keeper information to the DVLA database.
     *
     * @param regNo   The registration number of the car.
     * @param keeper The keeper information to be added.
     */
    public void addKeeperInfo(RegNo regNo, Keeper keeper) {
        keeperInfoMap.put(regNo, keeper);
    }

    /**
     * Displays information about all registered cars in the DVLA database.
     */
    public void showAllCars() {
        for (Map.Entry<RegNo, Car> entry : getRegistrationInfoMap().entrySet()) {
            RegNo regNo = entry.getKey();
            Car car = entry.getValue();
            System.out.println("Registration Number: " + regNo.getRegNo());
            System.out.println("Car Details: " + car.toString());
            System.out.println();
        }
    }

    /**
     * Retrieves the registration information map.
     *
     * @return The map of registration numbers to car information.
     */
    public Map<RegNo, Car> getRegistrationInfoMap() {
        return registrationInfoMap;
    }

    /**
     * Retrieves a mapping of registration numbers to keeper information.
     *
     * @return The map of registration numbers to keeper information.
     */
    public Map<RegNo, Keeper> getRegistrationToKeeperMap() {
        Map<RegNo, Keeper> registrationToKeeperMap = new HashMap<>();
        for (Map.Entry<RegNo, Keeper> entry : keeperInfoMap.entrySet()) {
            RegNo regNo = entry.getKey();
            Keeper keeper = entry.getValue();
            registrationToKeeperMap.put(regNo, keeper);
        }
        return registrationToKeeperMap;
    }

    /**
     * Sets the registration information map.
     *
     * @param registrationInfoMap The map of registration numbers to car information.
     */
    public void setRegistrationInfoMap(Map<RegNo, Car> registrationInfoMap) {
        this.registrationInfoMap = registrationInfoMap;
    }

    /**
     * Retrieves the keeper information map.
     *
     * @return The map of registration numbers to keeper information.
     */
    public Map<RegNo, Keeper> getKeeperInfoMap() {
        return keeperInfoMap;
    }

    /**
     * Sets the keeper information map.
     *
     * @param keeperInfoMap The map of registration numbers to keeper information.
     */
    public void setKeeperInfoMap(Map<RegNo, Keeper> keeperInfoMap) {
        this.keeperInfoMap = keeperInfoMap;
    }

    /**
     * Saves warning and reminder data to a flash drive with the specified filename.
     *
     * @param filename The name of the file to save the data to.
     * @param warningData The map containing warning data.
     * @param reminderData The map containing reminder data.
     */
    public void saveWarningReminderDataToFlashDrive(String filename, Map<RegNo, Keeper> warningData, Map<RegNo, Keeper> reminderData) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            Map<String, Map<RegNo, Keeper>> dataToSave = Map.of("warning", warningData, "reminder", reminderData);
            outputStream.writeObject(dataToSave);
            System.out.println("Warning and Reminder Data saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads warning and reminder data from a flash drive with the specified filename.
     *
     * @param filename The name of the file to read the data from.
     * @return A map containing warning and reminder data, or null if an error occurs.
     */
    public static Map<String, Map<RegNo, Keeper>> readWarningReminderDataFromFlashDrive(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (Map<String, Map<RegNo, Keeper>>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    /**
     * Retrieves a list of keepers for tax expiration reminder in the specified month.
     *
     * @param month The month for which the tax expiration reminder is requested.
     * @return A map of registration numbers to keepers for tax expiration reminder.
     */
    public Map<RegNo, Keeper> getTaxExpirationReminderList(Month month) {
        Map<RegNo, Keeper> reminderList = new HashMap<>();
        for (Map.Entry<RegNo, Car> entry : registrationInfoMap.entrySet()) {
            RegNo regNo = entry.getKey();
            Car car = entry.getValue();
            if (car.getTaxExpiresEndMonth() == month) {
                Keeper keeper = keeperInfoMap.get(regNo);
                reminderList.put(regNo, keeper);
            }
        }
        return reminderList;
    }
    
    /**
     * Helper method to print registration numbers and keepers from a given letter list.
     *
     * @param letterList A Map containing registration numbers and corresponding keepers.
     * @param month The month for which the letters are printed.
     */
    public void printLetters(Map<RegNo, Keeper> letterList, Month month) {
        for (Map.Entry<RegNo, Keeper> entry : letterList.entrySet()) {
            RegNo regNo = entry.getKey();
            Keeper keeper = entry.getValue();
            System.out.println("Registration Number: " + regNo.getRegNo());
            System.out.println("Keeper Details: " + keeper.toString());
            System.out.println("Month: " + month); // Display the month
            System.out.println();
        }
    }

    /**
     * Saves DVLA data to a flash drive with the specified filename.
     *
     * @param filename The name of the file to save the data to.
     */
    public void saveDataToFlashDrive(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
            System.out.println("Data saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads DVLA data from a flash drive with the specified filename.
     *
     * @param filename The name of the file to read the data from.
     * @return The DVLA object read from the flash drive, or null if an error occurs.
     */
    public static DVLA readDataFromFlashDrive(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (DVLA) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Retrieves a list of keepers for expired tax warning in the specified month.
     *
     * @param month The month for which the expired tax warning is requested.
     * @return A map of registration numbers to keepers for expired tax warning.
     */
    public Map<RegNo, Keeper> getExpiredTaxWarningList(Month month) {
        Map<RegNo, Keeper> warningList = new HashMap<>();
        for (Map.Entry<RegNo, Car> entry : registrationInfoMap.entrySet()) {
            RegNo regNo = entry.getKey();
            Car car = entry.getValue();
            if (car.getTaxExpiresEndMonth() == month && month.ordinal() < Month.values().length - 1) {
                // Assuming Month enum values are in order, check if tax has already expired
                Keeper keeper = keeperInfoMap.get(regNo);
                warningList.put(regNo, keeper);
            }
        }
        return warningList;
    }
    
    /**
     * Retrieves a map of registration numbers to months representing reminder months for each registered car.
     *
     * @return A map containing registration numbers and corresponding reminder months for each car.
     */
    public Map<RegNo, Month> getReminderMonths() {
        return getReminderMonths();
    }

    /**
     * Retrieves a map of registration numbers to months representing warning months for each registered car.
     *
     * @return A map containing registration numbers and corresponding warning months for each car.
     */
    public Map<RegNo, Month> getWarningMonths() {
        return getWarningMonths();
    }

    /**
     * Retrieves a map of registration numbers to car objects representing all registered cars.
     *
     * @return A map containing registration numbers and corresponding car objects for all registered cars.
     */
    public Map<RegNo, Car> getCarRegistrations() {
        return carRegistrations;
    }

    /**
     * Sets the map of car registrations for the DVLA object.
     *
     * @param carRegistrations The map of registration numbers to car objects to be set.
     */
    public void setCarRegistrations(Map<RegNo, Car> carRegistrations) {
        this.carRegistrations = carRegistrations;
    }

    /**
     * Retrieves a map of registration numbers to keeper objects representing all registered keepers.
     *
     * @return A map containing registration numbers and corresponding keeper objects for all registered keepers.
     */
    public Map<RegNo, Keeper> getKeeperInfo() {
        return keeperInfo;
    }

    /**
     * Sets the map of keeper information for the DVLA object.
     *
     * @param keeperInfo The map of registration numbers to keeper objects to be set.
     */
    public void setKeeperInfo(Map<RegNo, Keeper> keeperInfo) {
        this.keeperInfo = keeperInfo;
    }
}

