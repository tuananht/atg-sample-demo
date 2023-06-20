import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_using-closebroswer-it-only-close-browser-but-still-chromedriver-is-not-killed-how-to-killed-chrome-driver'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/using-closebroswer-it-only-close-browser-but-still-chromedriver-is-not-killed-how-to-killed-chrome-driver/6090')

'step 2: Add visual checkpoint at Page_t_using-closebroswer-it-only-close-browser-but-still-chromedriver-is-not-killed-how-to-killed-chrome-driver'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00926_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
