import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to maintain an arbitrarily long list of messages.
 * Messages are numbered for external reference by a human user.
 * In this version, message numbers start at 0.
 * 
 * @author Abdul Razak.
 * @version 26/03/2023
 */
public class Notebook
{
    // Storage for an arbitrary number of messages.
    private ArrayList<String> messageList;

    /**
     * Perform any initialisation that is required for the
     * notebook.
     */
    public Notebook()
    {
        messageList = new ArrayList<String>();
    }

    /**
     * Store a new message into the notebook.
     * @param message The message to be stored.
     */
    public void storeNote(String message)
    {
        messageList.add(message);
    }

    /**
     * Search each message stopping the search when a message
     * contains the given text.
     * @param searchString the text (series of characters) to search for
     * @return true if text is found else false
     */
    public boolean hasMessage(String searchString)
    {
        int index = 0;
        boolean found = false;
        while(index < messageList.size() && !found) {
            String note = messageList.get(index);
            if(note.contains(searchString)) {
                // We don't need to keep looking.
                found = true;
            }
            else {
                index++;
            }
        }
        // Either we found it, or we searched the whole collection.
        return found;
    }

    /**
     * Remove the message at the given index position from the notebook
     * displays an error message for invalid message numbers
     * @param messageNumber
     */
    public void removemessage(int messageNumber)
    {
        if(messageNumber < 0){
            System.out.println("Note number must be positive");
        }
        else if(messageNumber < numberOfMessages()){
            // This is a valid message number so remove
            messageList.remove(messageNumber);
        }
        else {
            // This is not a valid message number so do nothing
            System.out.println("Invalid note number");
        }
    }

    /**
     * @return The number of massages currently in the notebook.
     */
    public int numberOfMessages()
    {
        return messageList.size();
    }

    /**
     * List all the messages in the notebook. 
     * Uses for-each loop
     */
    public void listmessagesForEach()
    {
        for(String element : messageList){
            System.out.println(element);
        }
    }

    /**
     * List all the messages in the notebook. <br>
     * Uses while loop
     */
    public void listNotesWhile()
    {
        int index = 0;
        while(index < messageList.size()) {
            System.out.println(messageList.get(index));
            index++;
        }
    }

    /**
     * List all the messages in the notebook. <br>
     * Uses an iterator
     */
    public void listNotesIterator()
    {
        Iterator<String> it = messageList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Show a message.
     * @param messageNumber The number of the message to be shown.
     */
    public void showmessage(int messageNumber)
    {
        if(messageNumber < 0) {
            System.out.println("Note number must be positive");
        }
        else if(messageNumber < numberOfMessages()) {
            // This is a valid message number, so we can print it.
            System.out.println(messageList.get(messageNumber));
        }
        else {
            // This is not a valid message number, so do nothing.
            System.out.println("Invalid note number");
        }
    }

    /**
     * Shows all messages that contain the given text uses a
     * for-each loop
     * @param searchString the text (series of characters) to search for
     */
    public void showMessages(String searchString)
    {
        for(String element : messageList){
            if(element.contains(searchString)){
                System.out.println(element);
            }
        } 
    }

    /**
     * Removes all messages that contain the given text uses a
     * for-each loop
     * @param searchString the text (series of characters) to search for
     */
    public void removeMessages(String searchString)
    {
        Iterator<String> it = messageList.iterator();
        while(it.hasNext()){
            String note = it.next();
            if(note.contains(searchString)){
                it.remove();
            }
        } 
    }

}
