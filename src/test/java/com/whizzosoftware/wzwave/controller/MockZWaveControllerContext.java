/*
 *******************************************************************************
 * Copyright (c) 2014 Whizzo Software, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************
*/
package com.whizzosoftware.wzwave.controller;

import com.whizzosoftware.wzwave.frame.DataFrame;

import java.util.ArrayList;
import java.util.List;

public class MockZWaveControllerContext implements ZWaveControllerContext {
    private List<DataFrame> sentFrames = new ArrayList<>();

    @Override
    public byte getNodeId() {
        return 0x01;
    }

    @Override
    public void sendDataFrame(DataFrame frame, boolean isListeningNode) {
        sentFrames.add(frame);
    }

    @Override
    public void sendEvent(Object e) {

    }

    public int getSentFrameCount() {
        return sentFrames.size();
    }

    public List<DataFrame> getSentFrames() {
        return sentFrames;
    }

    public void clearSentFrames() {
        sentFrames.clear();
    }
}
