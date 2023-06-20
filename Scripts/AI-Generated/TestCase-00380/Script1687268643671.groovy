import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_what-is-the-meaning-of-the-word-visible-in-the-given-web-element-is-visible-within-timeout-in-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/what-is-the-meaning-of-the-word-visible-in-the-given-web-element-is-visible-within-timeout-in-katalon/44189')

'step 2: Add visual checkpoint at Page_t_what-is-the-meaning-of-the-word-visible-in-the-given-web-element-is-visible-within-timeout-in-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00380_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
