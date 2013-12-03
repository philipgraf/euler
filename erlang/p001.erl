-module(p001).
-export([main/0]).

p001(N) ->
  lists:sum([X || X <- lists:seq(1,N-1), X rem 3 =:= 0 orelse X rem 5 =:= 0 ]).

main() ->
  io:fwrite("~.10B~n",[p001(1000)]).
