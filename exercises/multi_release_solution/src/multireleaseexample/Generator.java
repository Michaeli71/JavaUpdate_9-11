package multireleaseexample;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Generator 
{
	public Collection<String> createStrings() 
	{
		final List<String> strings = new ArrayList<>();
		strings.add("Java");
		strings.add("8");
		return strings;
	}
}
