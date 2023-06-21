import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_does-katalon-support-integration-of-other-reporting-frameworks-such-as-allure-or-extent-report-if-yes-how'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/does-katalon-support-integration-of-other-reporting-frameworks-such-as-allure-or-extent-report-if-yes-how/6496')

'step 2: Add visual checkpoint at Page_t_does-katalon-support-integration-of-other-reporting-frameworks-such-as-allure-or-extent-report-if-yes-how'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00017_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
