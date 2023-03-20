import android.view.View;
import android.widget.Toast;


    // BELOW IS FUNCTION FOR WHEN DONE BUTTON IS PRESSED
    public class checkIfChecksAreChecked(View v)
    {
        String FFHtickbox="";
        String FOBtickbox="";

        // isChecked() is used to check whether the CheckBox is in true state or not.

        if(mWorkingAtHeight.isChecked()) {
            FFHtickbox = FFHtickbox + "Working at height safe";
            Toast.makeText(getApplicationContext(), FFHtickbox,
                    Toast.LENGTH_SHORT).show();
        }
        else{
            FFHtickbox = FFHtickbox + "Working at height unsafe";
            Toast.makeText(getApplicationContext(), FFHtickbox,
                    Toast.LENGTH_SHORT).show();
        }
        if(mFallingObjects.isChecked()) {
            FOBtickbox = FOBtickbox + "Falling objects safe";
            Toast.makeText(getApplicationContext(), FOBtickbox,
                    Toast.LENGTH_SHORT).show();
        }
        else{
            FOBtickbox = FOBtickbox + "Falling objects unsafe";
            Toast.makeText(getApplicationContext(), FOBtickbox,
                    Toast.LENGTH_SHORT).show();
        }
        // Toast is created to display the message using show() method - DUPLICATE - LESS BOILERPLATE LEAVE FOR NOW
        Toast.makeText(getApplicationContext(), FFHtickbox,
                Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), FOBtickbox,
                Toast.LENGTH_SHORT).show();


    }
// END OF FUNCTION FOR WHEN DONE BUTTON IS PRESSED