puts (1...ARGV[0].to_i).select{|x| x%3==0 || x%5==0}.inject{|sum,x| sum + x}
