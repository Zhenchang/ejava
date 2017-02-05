/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endpoint;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.enterprise.context.ApplicationScoped;
import model.Note;

/**
 *
 * @author Liu Zhenchang
 */
@ApplicationScoped
public class NoteQueue {
    
    private final BlockingQueue<Note> noteQueue = new LinkedBlockingQueue<>();
    
    public BlockingQueue<Note> getNoteQueue() {
        return noteQueue;
    } 
}
