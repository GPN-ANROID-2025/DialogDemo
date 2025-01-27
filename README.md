### Day 8 : Android Dialog and Custom Dialog

#### **Default Dialog**
- Default dialogs in Android are simple, pre-designed UI components that display messages and provide actions.
- Created using the `AlertDialog` class.
- Common features include:
  - Title and message display.
  - Buttons for actions (e.g., "OK", "Cancel").
  - Can handle user inputs through button click listeners.

#### **Custom Dialog**
- Custom dialogs allow developers to design unique layouts beyond the default style.
- Created by inflating a custom XML layout and attaching it to an `AlertDialog`.
- Offers flexibility to include custom views like text fields, buttons, images, or any other UI components.
- Commonly used when the default dialog UI does not meet design or functionality requirements.


### Common Methods for Android Dialogs

#### **1. `setTitle(String title)`**
- Sets the title of the dialog.
- Accepts a `String` parameter to display as the dialog's title.

#### **2. `setMessage(String message)`**
- Sets the message or description to be displayed inside the dialog.
- Accepts a `String` parameter for the content.

#### **3. `show()`**
- Displays the dialog on the screen.
- Needs to be called after creating the dialog to make it visible.

#### **4. `dismiss()`**
- Closes the dialog and removes it from the screen.
- Can be used programmatically to hide the dialog when an action is completed.

#### **5. `setCancelable(boolean cancelable)`**
- Determines whether the dialog can be canceled by the user (e.g., tapping outside the dialog).
- Accepts a `boolean` parameter:
  - `true`: The dialog is cancelable.
  - `false`: The dialog cannot be dismissed by outside touch or back press.

#### **6. `setPositiveButton(String text, DialogInterface.OnClickListener listener)`**
- Adds a positive action button to the dialog (e.g., "OK").
- Accepts:
  - `String text`: Text to display on the button.
  - `DialogInterface.OnClickListener listener`: Callback for button click handling.

#### **7. `setNegativeButton(String text, DialogInterface.OnClickListener listener)`**
- Adds a negative action button to the dialog (e.g., "Cancel").
- Accepts:
  - `String text`: Text to display on the button.
  - `DialogInterface.OnClickListener listener`: Callback for button click handling.

#### **8. `setNeutralButton(String text, DialogInterface.OnClickListener listener)`**
- Adds a neutral action button to the dialog (e.g., "Later").
- Accepts:
  - `String text`: Text to display on the button.
  - `DialogInterface.OnClickListener listener`: Callback for button click handling.

#### **9. `setView(View view)`**
- Sets a custom layout for the dialog.
- Accepts a `View` object (e.g., an inflated layout) to replace the default content.

#### **10. `setOnCancelListener(DialogInterface.OnCancelListener listener)`**
- Sets a listener to handle the event when the dialog is canceled (e.g., user presses the back button).
- Accepts a `DialogInterface.OnCancelListener` callback.

#### **11. `setOnDismissListener(DialogInterface.OnDismissListener listener)`**
- Sets a listener to handle the event when the dialog is dismissed (either programmatically or by user interaction).
- Accepts a `DialogInterface.OnDismissListener` callback.
