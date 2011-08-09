#!/usr/bin/perl


if(/^GET.*8080\/petpark/){
	print $_;
}
elsif(/^POST.*8080\/petpark/){
	print $_;
}
elsif(/Cookie:/){
	print $_;
}
