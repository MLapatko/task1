package com.soundRecorder;

import java.util.List;

/**
 * Created by user on 21.03.2017.
 */
public class DickBuilder {
    public SoloDisk createDisk(List songs){
        return new SoloDisk(songs);
    }
}
