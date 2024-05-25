class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> entradas = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(') {
                entradas.push(s.charAt(i)) ;               
            }else{
                
                if (entradas.empty()) {
                    return false;
                }else{
                    if (s.charAt(i)=='}') {
                    
                    if (entradas.peek() == '{') {
                        entradas.pop();
                    }else{
                        return false;
                    }
                }
                if (s.charAt(i)==']') {
                    if (entradas.peek() == '[') {
                        entradas.pop();
                    }else{
                        return false;
                    }
                }
                if (s.charAt(i)==')') {
                    if (entradas.peek() == '(') {
                        entradas.pop();
                    }else{
                        return false;
                    }
                }
                
                }
            }
        }
        if (entradas.empty()) {
            
        return true;
        }else{
            return false;
        }    
    }
}