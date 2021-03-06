/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxtras.labs.scene.control.window;

import javafx.collections.ObservableList;

/**
 *
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public interface Clipboard {
    public boolean select(SelectableNode n, boolean selected);
    public void unselectAll();
    ObservableList<SelectableNode> getSelectedItems();
}
