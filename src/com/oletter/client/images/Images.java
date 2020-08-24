package com.oletter.client.images;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface Images extends ClientBundle {


    public Images INSTANCE = GWT.create(Images.class);

    @ClientBundle.Source("export.png")
    ImageResource upload();

    @ClientBundle.Source("cross.png")
    ImageResource cross();

    @ClientBundle.Source("search.png")
    ImageResource search();


}

