#!/usr/perl -w

use strict;

my $sum=0;

for (1..999){
  if(!($_ %  5) || !($_ % 3)){
    $sum += $_;   
  }
}
print $sum, "\n";
