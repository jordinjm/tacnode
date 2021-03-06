package in.jord.tacnode.parsers.primitives;

import in.jord.tacnode.exceptions.InvalidTypeException;
import in.jord.tacnode.parsers.ArgumentParser;

import java.util.Iterator;

/**
 * Created by Jordin on 8/9/2017.
 * Jordin is still best hacker.
 */
public class CharParser implements ArgumentParser<Character> {
    @Override
    public Character parse(Iterator<String> arguments) throws InvalidTypeException {
        String argument = arguments.next();
        if (argument.length() > 1) {
            throw new InvalidTypeException("char");
        }
        return argument.charAt(0);
    }
}
