package transformation;

import cucumber.api.Transformer;

/**
 * Created by petrash on 1/24/18.
 */
public class EmailTransform extends Transformer<String> {

    @Override
    public String transform(String userName) {
        return userName.concat("@petrash.com");
    }

}
