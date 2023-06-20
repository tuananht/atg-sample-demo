import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_issue-when-running-tests-on-real-ios-devices'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/issue-when-running-tests-on-real-ios-devices/11359')

'step 2: Add visual checkpoint at Page_t_issue-when-running-tests-on-real-ios-devices'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00472_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
