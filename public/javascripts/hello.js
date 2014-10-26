'use strict';

/**
 *
 * Main module of the application.
 */
 (function(){
	var app = angular.module('anotheryeomanApp', ['store-directives']);

	  app.controller('StoreController', ['$http', function($http){
	    var store = this;
	    store.products = [];
	    //$http.get('http://miprimerapaginaaws.com.s3-website-us-east-1.amazonaws.com/products-store.json').success(function(data){
	    $http.get('/products').success(function(data){
	      store.products = data;
	    });
	  }]);

	  app.controller('ReviewController', function() {
	    this.review = {};

	    this.addReview = function(product) {
	      product.reviews.push(this.review);

	      this.review = {};
	    };
	  });
}());

(function(){
	var app = angular.module('store-directives', []);

    app.directive('productDescription', ['$sce', function($sce) {
      return {
        restrict: 'E',
        templateUrl: $sce.trustAsResourceUrl('https://s3.amazonaws.com/miprimerapaginaaws.com/product-description.html'), //http://miprimerapaginaaws.com.s3-website-us-east-1.amazonaws.com/product-description.html
      };
    }]);

    app.directive('productReviews', ['$sce', function($sce) {
      return {
        restrict: 'E',
        templateUrl: $sce.trustAsResourceUrl('https://s3.amazonaws.com/miprimerapaginaaws.com/product-reviews.html'), //http://miprimerapaginaaws.com.s3-website-us-east-1.amazonaws.com/product-reviews.html
      };
    }]);

    app.directive('productSpecs', ['$sce', function($sce) {
      return {
        restrict:'A',
        templateUrl: $sce.trustAsResourceUrl('https://s3.amazonaws.com/miprimerapaginaaws.com/product-specs.html'), //http://miprimerapaginaaws.com.s3-website-us-east-1.amazonaws.com/product-specs.html
      };
    }]);

    app.directive('productTabs', ['$sce', function($sce) {
      return {
        restrict: 'E',
        templateUrl: $sce.trustAsResourceUrl('https://s3.amazonaws.com/miprimerapaginaaws.com/product-tabs.html'), //http://miprimerapaginaaws.com.s3-website-us-east-1.amazonaws.com/product-tabs.html
        controller: function() {
          this.tab = 1;

          this.isSet = function(checkTab) {
            return this.tab === checkTab;
          };

          this.setTab = function(activeTab) {
            this.tab = activeTab;
          };
        },
        controllerAs: 'tab'
      };
    }]);

    app.directive('productGallery', ['$sce', function($sce) {
      return {
        restrict: 'E',
        templateUrl: $sce.trustAsResourceUrl('https://s3.amazonaws.com/miprimerapaginaaws.com/product-gallery.html'), //http://miprimerapaginaaws.com.s3-website-us-east-1.amazonaws.com/product-gallery.html
        controller: function() {
          this.current = 0;
          this.setCurrent = function(imageNumber){
            this.current = imageNumber || 0;
          };
        },
        controllerAs: 'gallery'
      };
    }]);
}());