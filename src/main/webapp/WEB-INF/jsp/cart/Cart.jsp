<%@ include file="../common/IncludeTop.jsp"%>
<div id="Content">
<div id="BackLink">
<a href="main">Return to Main Menu</a>
</div>

<div id="Catalog">

<div id="Cart">

<h2>Shopping Cart</h2>
	<script type="text/javascript" src="../cart.js"></script>


	<form action="updateCartQuantities" method="post" name="cartForm">
	<table id="cartTable">
		<thead>
		<tr>
			<th><b>Item ID</b></th>
			<th><b>Product ID</b></th>
			<th><b>Description</b></th>
			<th><b>In Stock?</b></th>
			<th><b>Quantity</b></th>
			<th><b>List Price</b></th>
			<th><b>Total Cost</b></th>
			<th>&nbsp;</th>
		</tr>
		</thead>

		<tbody>
		<c:if test="${sessionScope.cart.numberOfItems == 0}">
			<tr>
				<td colspan="8"><b>Your cart is empty.</b></td>
			</tr>
		</c:if>

		<c:forEach var="cartItem" items="${sessionScope.cart.cartItems}">
			<tr>
				<td>

					<a href="viewItem?itemId=${cartItem.item.itemId}" id="itemId">${cartItem.item.itemId}</a>

				</td>

				<td>${cartItem.item.product.productId}</td>


				<td>${cartItem.item.attribute1} ${cartItem.item.attribute2}
						${cartItem.item.attribute3} ${cartItem.item.attribute4}
						${cartItem.item.attribute5} ${cartItem.item.product.name}</td>

				<td>${cartItem.inStock}</td>
				<td>

					<input type="text" name="${cartItem.item.itemId}" value="${cartItem.quantity}" >

				</td>
				<td><fmt:formatNumber value="${cartItem.item.listPrice}" pattern="$#,##0.00" /></td>
				<td><fmt:formatNumber value="${cartItem.total}" pattern="$#,##0.00" /></td>




				<td>
					<a href="removeItemFromCart?workingItemId=${cartItem.item.itemId}" class="Button">Remove</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>

		<tr>
			<td colspan="7" id="totalItemPrice">
				Sub Total:<fmt:formatNumber value="${sessionScope.cart.subTotal}" pattern="$#,##0.00" />
				<input type="submit" value="Update Cart">
			</td>

			<td>&nbsp;</td>
		</tr>
	</table>
	</form>




	<c:if test="${sessionScope.cart.numberOfItems > 0}">

		<a href="viewOrderForm"  class="Button">Proceed to Checkout</a>
</c:if>

</div>


<div id="Separator">&nbsp;</div>
</div>
</div>
<%@ include file="../common/IncludeBottom.jsp"%>