import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_hi-team-im-getting-an-error-in-capturing-the-td-values-can-anyone-suggest-me-the-solution-for-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/hi-team-im-getting-an-error-in-capturing-the-td-values-can-anyone-suggest-me-the-solution-for-this/82230/3')

'step 2: Add visual checkpoint at Page_t_hi-team-im-getting-an-error-in-capturing-the-td-values-can-anyone-suggest-me-the-solution-for-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00437_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
