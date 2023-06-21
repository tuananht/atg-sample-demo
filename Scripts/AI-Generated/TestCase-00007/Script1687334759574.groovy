import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_autonomous-test-generation-revolutionizing-software-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/autonomous-test-generation-revolutionizing-software-testing')

'step 2: At Page_resources-center_blog_autonomous-test-generation-revolutionizing-software-testing click on hyperlink_resources_center_blog_ --> navigate to Page_resources-center_blog#products'

testObj = findTestObject('Object Repository/Page_resources-center_blog_autonomous-test-generation-revolutionizing-software-testing/hyperlink_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/resources-center/blog/autonomous-test-generation-revolutionizing-software-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_resources-center_blog#products'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00007_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
