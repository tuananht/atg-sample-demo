import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_popular-link'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/badges/28/popular-link')

'step 2: At Page_popular-link click on hyperlink_t_unknown_error_devtoolsactiveport_file_ --> navigate to Page_t_unknown-error-devtoolsactiveport-file-doesnt-exist-the-process-started-from-chrome-location-usr-bin-google-chrome-is-no-longer-running-so-chromedriver-is-assuming-that-chrome-has-3'

testObj = findTestObject('Object Repository/Page_badges_popular-link/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/badges/.*/popular-link(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_unknown-error-devtoolsactiveport-file-doesnt-exist-the-process-started-from-chrome-location-usr-bin-google-chrome-is-no-longer-running-so-chromedriver-is-assuming-that-chrome-has-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00013_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
