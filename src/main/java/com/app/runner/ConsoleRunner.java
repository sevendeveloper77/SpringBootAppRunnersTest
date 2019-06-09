package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//-- option args --		
		//1.read all keys
		Set<String> optionkeys=args.getOptionNames();
		System.out.println(optionkeys);
		
		//2.One key related values
		List<String> list=args.getOptionValues("profile");
		System.out.println(list);
		
		//3.check for key exist
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
		//-- Non option --
		//-- All args --
		String[] arr=args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));
		
		List<String> l = args.getNonOptionArgs();
		System.out.println(l);
		
	}

}
